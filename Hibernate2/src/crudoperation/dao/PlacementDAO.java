package crudoperation.dao;

import javax.persistence.EntityManager;


import crudoperation.entities.Placement;

public interface PlacementDAO {
	
	Placement getPlacementById(long placementId);
	void addPlacement(Placement placement);
	void removePlacement(Placement placement);
	void updatePlacement(Placement placement);
	void commitTransaction();
	void beginTransaction();

}

 

