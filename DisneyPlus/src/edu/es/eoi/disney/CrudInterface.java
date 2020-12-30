package edu.es.eoi.disney;

public interface CrudInterface<E,ID> {
	
	public E readById(ID id);
	
	public void deleteById(ID id);

}
