package asw.springboot.writers.service;

public interface ProductionService {
	public String getProductionByName(String author);
	public String getProductionByNameAndYear(String author,int year);
}