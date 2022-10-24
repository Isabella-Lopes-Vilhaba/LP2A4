package LP2A4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class AlunoPropertiesDAO implements AlunoDAO {

	static Properties props = new Properties();
	
	static {
		try {
			final FileInputStream file = new FileInputStream("/home/estudante/Documentos/aluno.properties");
			props.load(file);
			System.out.println("Arquivo de propriedades carregado");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private static synchronized void save() {
		try {
			final FileOutputStream fos = new FileOutputStream("/home/estudante/Documentos/aluno.properties");
			props.store(fos, null);
			System.out.println("Arquivo de propriedades salvo");
		} catch( Exception e) {
			System.out.println(e);
		}
	}
	
	public boolean existeMatricula(String matricula) {
		return props.containsKey("Matrícula: " + matricula);
	}
	
	@Override
	public boolean create(Aluno aluno) {
		if(existeMatricula (aluno.getMatricula())) {
			System.out.println("Erro");
			return false;
		}
		
		props.put("nome", aluno.getNome());
		props.put("matricula", aluno.getMatricula());
		props.put("endereco", aluno.getEndereco());
		save();
		return true;
	}

	@Override
	public Aluno retrieve(String matricula) {
		if (!existeMatricula (matricula)) {
			System.err.println("Aluno: " + matricula + "Não encontrado");
			return null;
		}
		
		final Aluno aluno = new Aluno();
		aluno.setMatricula(props.getProperty("matricula." + matricula));
		aluno.setNome(props.getProperty("nome." + matricula));
		aluno.setEndereco(props.getProperty("endereco." + matricula));
		return aluno;
	}

	@Override
	public boolean update(Aluno aluno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String matricula) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void main(String[] args) {
		AlunoPropertiesDAO dao = new AlunoPropertiesDAO();
		Aluno aluno = new Aluno();
		aluno.setMatricula("12345");
		aluno.setNome("Maria");
		aluno.setEndereco("Acre");
		
		dao.create(aluno);
	}

}
