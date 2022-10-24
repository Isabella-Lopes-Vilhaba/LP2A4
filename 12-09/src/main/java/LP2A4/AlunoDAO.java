package LP2A4;

public interface AlunoDAO {
	
	public boolean create(Aluno aluno);
	public Aluno retrieve(String matricula);
	public boolean update(Aluno aluno);
	public boolean delete(String matricula);
}
