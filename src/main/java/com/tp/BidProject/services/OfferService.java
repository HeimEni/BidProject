package com.tp.BidProject.services;

import com.tp.BidProject.entities.Offer;
import com.tp.BidProject.repositories.OfferDAOInterface;
import com.tp.BidProject.repositories.UserDAOInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferService implements OfferServiceInterface{
    @Autowired
    OfferDAOInterface offerDAO;

    @Override
    public Offer getOfferByid(Integer id) {
        if(offerDAO.getOfferById(id) != null){
            return offerDAO.getOfferById(id);
        }
        return null;
    }

    @Override
    public boolean insertOffer(Offer offer) {
        return offerDAO.insertOffer(offer);
    }

    @Override
    public List<Offer> getAll() {
        return offerDAO.getAll();
    }

    @Override
    public boolean updateOffer(Integer id, Offer offer) {
        return offerDAO.updateOffer(id,offer);
    }

}
