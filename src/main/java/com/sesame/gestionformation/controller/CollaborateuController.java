package com.sesame.gestionformation.controller;

import com.sesame.gestionformation.controller.api.Collaobrateurapi;
import com.sesame.gestionformation.dto.CollaborateurDto;
import com.sesame.gestionformation.dto.CompetenceDto;
import com.sesame.gestionformation.model.Collaborateur;
import com.sesame.gestionformation.model.Competence;
import com.sesame.gestionformation.services.CollaborateurService;
import com.sesame.gestionformation.services.ComptenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@RestController
public class CollaborateuController implements Collaobrateurapi {

@Autowired
    CollaborateurService collaborateurService;
    @Override
    public Collaborateur save(Collaborateur collaborateur) {
      return   collaborateurService.save(collaborateur);
    }

    @Override
    public Optional<Collaborateur> findById(Integer id) {

        return  collaborateurService.findById(id);
    }

    @Override
    public List<Collaborateur> findAll() {
        return collaborateurService.findAll();
    }

    @Override
    public void delete(Integer id) {
        collaborateurService.delete(id);

    }

    @Override
    public ResponseEntity<String> ajouterCompetenceACollaborateur(Long comptenceid, Integer idcollaborateur) {
        return null;
    }

    @Override
    public ResponseEntity<Collaborateur> updateCollaborateur(Integer id, Collaborateur collaborateur) {
        return collaborateurService.updateCollaborateur(id,collaborateur);
    }

    @Override
    public int nombreCollaborateur() {
        return collaborateurService.nombreCollaborateur();
    }


  /*  @Override
    public ResponseEntity<String> ajouterCompetenceACollaborateur(Long comptenceid, Integer idcollaborateur) {
      Optional<CompetenceDto> c = comptenceService.findById(comptenceid);
        Optional<CollaborateurDto>cc= Optional.ofNullable(collaborateurService.findById(idcollaborateur));
        if (c == null || cc == null) {
            return ResponseEntity.notFound().build();
        }

    collaborateurService.save(cc);

        return ResponseEntity.ok().build();
    }*/
}
