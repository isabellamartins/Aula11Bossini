import model.Usuario;

public class UsuarioDAO {
    public boolean validar(Usuario usuario) {
        String sqlSelect = "SELECT username, password FROM usuario WHERE username = ? and password = ?";
    public byte[] validar(Usuario usuario) {
        String sqlSelect = "SELECT * FROM usuario WHERE username = ?";

        try (Connection conn = ConnectionFactory.obtemConexao(); 
                PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
                    stm.setString(1, usuario.getUsername());
                    stm.setString(2, usuario.getPassword());
                    try (ResultSet rs = stm.executeQuery();) {
                        return (rs.next()) ? true : false;
                        if (rs.next()) {
                        	return rs.getBytes("password");
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
        return null;
    }

    public void cadastrar(Usuario usuario) {
    	String sqlInsert = "INSERT INTO usuario VALUES(?,?)";

    	try (Connection conn = ConnectionFactory.obtemConexao();
    			PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
    		stm.setString(1, usuario.getUsername());
    		stm.setBytes(2, usuario.getPasswordBytes());

    		stm.execute();	
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    }

} 
