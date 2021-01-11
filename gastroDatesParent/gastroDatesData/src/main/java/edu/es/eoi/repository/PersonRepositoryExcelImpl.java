package edu.es.eoi.repository;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import edu.es.eoi.entity.Person;
import edu.es.eoi.entity.User;

public class PersonRepositoryExcelImpl implements PersonRepository {
		
	@Override
	public void save(Person e) {
		
	}

	@Override	
	public Person read(String sf) {
		
		Map<String, User> usuarios=new HashMap<String, User>();
		
		Workbook workbook = null;
		try {		
			workbook = new XSSFWorkbook(new File("src/main/resources/usuarios.xlsx"));

			Sheet sheet = workbook.getSheet("Usuarios");

			int i = 0;
			for (Row row : sheet) {
				if (i != 0) {
					
					User user= new User();
					user.setUsername(row.getCell(0).getStringCellValue());
					user.setPassword(row.getCell(1).getStringCellValue());
					user.setName(row.getCell(2).getStringCellValue());
					user.setSurname(row.getCell(3).getStringCellValue());	
					
					usuarios.put(user.getUsername(),user);
				}
				i++;
			}

		} catch (Exception e) {
			e.printStackTrace();		
		} finally {
			try {
				workbook.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return usuarios.get(sf);
	}

	@Override
	public void delete(Person e) {
		
	}

	@Override
	public Person update(Person e) {
		return e;
	}

}
