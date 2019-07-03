package com.game.inca.maisqueespecial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.game.inca.maisqueespecial.model.Endereco;
import com.game.inca.maisqueespecial.model.Instituicao;
import com.game.inca.maisqueespecial.repository.InstituicaoRepository;

@RestController
@RequestMapping("/api")
class GroupController {

	@Autowired
	private InstituicaoRepository instituicaoRepository;
	private Instituicao instituicao;

    

    @GetMapping("/group/{id}")
    ResponseEntity<?> getGroup(@PathVariable Long id) {
        //Optional<Aluno> group = groupRepository.findById(id);
        //return new Aluno().map(response -> ResponseEntity.ok().body(response)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    	//return null;
    	return new ResponseEntity<Endereco>(new Endereco("RUA NOVAAAAA"), HttpStatus.OK);
    }

//    @PostMapping("/group")
//    ResponseEntity<Group> createGroup(@Valid @RequestBody Group group,
//                                      @AuthenticationPrincipal OAuth2User principal) throws URISyntaxException {
//        log.info("Request to create group: {}", group);
//        Map<String, Object> details = principal.getAttributes();
//        String userId = details.get("sub").toString();
//
//        // check to see if user already exists
//        Optional<User> user = userRepository.findById(userId);
//        group.setUser(user.orElse(new User(userId,details.get("name").toString(), details.get("email").toString()))); 
//
//        Group result = groupRepository.save(group);
//        return ResponseEntity.created(new URI("/api/group/" + result.getId()))
//                .body(result);
//    }
//
//    @PutMapping("/group/{id}")
//    ResponseEntity<Group> updateGroup(@Valid @RequestBody Group group) {
//        log.info("Request to update group: {}", group);
//        Group result = groupRepository.save(group);
//        return ResponseEntity.ok().body(result);
//    }
//
//    @DeleteMapping("/group/{id}")
//    public ResponseEntity<?> deleteGroup(@PathVariable Long id) {
//        log.info("Request to delete group: {}", id);
//        groupRepository.deleteById(id);
//        return ResponseEntity.ok().build();
//    }
}
