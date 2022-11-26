package Dados;

import Classes.Clientes;
import Util.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDDClientes {
     private Connection conn;
    
    public BDDClientes() {
        try {
            this.conn = Conexao.getConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de conexão: " + ":\n" + e.getMessage());
        }
    }
    
    public ArrayList listar() throws SQLException {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;
        ArrayList listaClientes = new ArrayList();

        try {
            String SQL = "SELECT * FROM clientes";
            connL = this.conn;

            ps = connL.prepareStatement(SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id_clientes = rs.getInt("ID_Cliente");
                String nome_Cliente = rs.getString("Nome");
                Date dataNasc = rs.getDate("Data_Nasc");
                long cpfCliente = rs.getLong("CPF");
                String emailCliente = rs.getString("Email");
                long fone = rs.getLong("Fone");
                int ativo = rs.getInt("Ativo");

                listaClientes.add(new Clientes(id_clientes, nome_Cliente, dataNasc,cpfCliente, emailCliente, fone, ativo));
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao listar clientes " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }

        return listaClientes;
    }
    
    public void adicionar(Clientes clientes) {

        PreparedStatement ps = null;
        Connection connL = null;

        if (clientes == null) {
            JOptionPane.showMessageDialog(null, "O campo cliente não pode ser nulo.");
        }
        try {
            String SQL = "INSERT INTO clientes (Nome, dataNasc, CPF, Email, Fone,ativo)"
                    + "values (?,?,?,?,?,?)";

            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setString(1, clientes.getNome());
            java.util.Date dataJAVA = clientes.getData_Nasc();
            java.sql.Date dataSQL = new java.sql.Date(dataJAVA.getTime());
            ps.setDate(2,dataSQL);
            ps.setLong(3, clientes.getCPF());
            ps.setString(4, clientes.getEmail());
            ps.setLong(5, clientes.getFone());
            ps.setInt(6, clientes.getAtivo());

            ps.executeUpdate();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir um novo cliente " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
    
    public void atualizar(Clientes clientes) {
        PreparedStatement ps = null;
        Connection connL = null;

        if (clientes == null) {
            JOptionPane.showMessageDialog(null, "O campo cliente não pode ser nulo.");
        }

        try {
            String SQL = "UPDATE clientes set Nome=?, dataNasc=?,CPF=?, Email=?, Fone,  WHERE ID_cliente=?";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setString(1, clientes.getNome());
             java.util.Date dataJAVA = clientes.getData_Nasc();
            java.sql.Date dataSQL = new java.sql.Date(dataJAVA.getTime());
            ps.setDate(2, dataSQL);
            ps.setLong(3, clientes.getCPF());
            ps.setString(4, clientes.getEmail());
            ps.setLong(5, clientes.getFone());
            ps.setInt(6, clientes.getID_Cliente());
            ps.executeUpdate();

        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cliente " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
    
    public void excluir(int id, int ativo) {
        PreparedStatement ps = null;
        Connection connL = null;
        try {
            String SQL = "DELETE FROM clientes WHERE ID_Cliente=?";
            connL = this.conn;

            ps = connL.prepareStatement(SQL);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar cliente " + sqle);
        } finally {
            Conexao.close(connL, ps);
        }
    }
//        if (id == 0) {
//            JOptionPane.showMessageDialog(null, "O campo clientes não pode ser nulo.");
//        }
//        try{
//            String SQL = "UPDATE clientes set ativo=? WHERE ID_cliente=?";
//            connL = this.conn;
//
//            ps = connL.prepareStatement(SQL);
//            ps.setInt(1,ativo);
//            ps.setInt(2, id);
//            ps.executeUpdate();
//        }catch(SQLException sqle){
//            
//        }
    
    
    public Clientes procurar(int ID_Cli) {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;
        Clientes clientes = new Clientes();
        clientes = null;
        try {
            String SQL = "SELECT * FROM clientes WHERE ID_Cliente = ?";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setInt(1, ID_Cli);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id_cliente = rs.getInt("ID_Cliente");
                String nome = rs.getString("Nome");
                Date dataNasc = rs.getDate("Data_Nasc");
                long CPF = rs.getLong("CPF");
                String email = rs.getString("Email");
                long fone = rs.getLong("Fone");
                int ativo = rs.getInt("ativo");
                
                clientes = new Clientes(id_cliente, nome, dataNasc, CPF, email, fone, ativo);
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao encontrar cliente " + sqle);
        } finally {
        }
        return clientes;
    }
}
