package com.tp.BidProject.repositories;

import com.tp.BidProject.entities.Offer;

import java.util.List;

public interface OfferDAOInterface {
    Offer getOfferById(Integer id);
    List<Offer> getAll();
    boolean insertOffer(Offer offer);
    boolean updateOffer(Integer id, Offer offer);


}
