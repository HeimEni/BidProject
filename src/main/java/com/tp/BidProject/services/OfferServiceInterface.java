package com.tp.BidProject.services;

import com.tp.BidProject.entities.Offer;

import java.util.List;

public interface OfferServiceInterface {
    Offer getOfferByid(Integer id);
    boolean insertOffer(Offer offer);
    List<Offer> getAll();
    boolean updateOffer(Integer id, Offer offer);

}
