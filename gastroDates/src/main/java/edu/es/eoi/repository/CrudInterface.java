package edu.es.eoi.repository;

public interface CrudInterface<E,SEARCH_FIELD> {

	void save(E e);
	
	void read(SEARCH_FIELD sf);
	
	void delete(E e);
	
	void update(E e);
	
}
