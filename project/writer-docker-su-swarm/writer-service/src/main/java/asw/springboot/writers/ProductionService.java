package asw.springboot.writers;

public interface ProductionService {
	public String getProductionByName(String author);
	public String getProductionByNameAndYear(String author,int year);
}