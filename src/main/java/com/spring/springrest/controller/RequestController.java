package com.spring.springrest.controller;

import com.spring.springrest.dto.OrganisationDTO;
import com.spring.springrest.dto.ResponseDTO;
import com.spring.springrest.dto.UserDTO;
import com.spring.springrest.services.OrganisationService;
import com.spring.springrest.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@RequestMapping("/test")
public class RequestController {

 private final UserService userservice;

 private final OrganisationService organisationservice;

 public RequestController(UserService userservice, OrganisationService organisationservice) {
  this.userservice = userservice;
  this.organisationservice = organisationservice;
 }

 @GetMapping("/userdetails/{organisationId}")
 public ResponseEntity<ResponseDTO> getUserDetails(Long organisationId) {

  return ResponseEntity.ok(new ResponseDTO(true, userservice.getUserDetails(organisationId)));
 }


 @PostMapping("/adduserdetails")
 public ResponseEntity<ResponseDTO> addUserDetails(@RequestBody @Validated UserDTO userDto) {

  return ResponseEntity.ok(new ResponseDTO(true, userservice.addUserDetails(userDto)));

 }


 @GetMapping("/organisationdetails")

 public ResponseEntity<ResponseDTO> getOrganisationDetails() {
  return ResponseEntity.ok(new ResponseDTO(true, organisationservice.getOrganisationDetails()));
 }

 @PostMapping(value = "/organisationdetails")
 public ResponseEntity<ResponseDTO> addOrganisationDetails(@RequestBody OrganisationDTO organisationDto) {
  return ResponseEntity.ok(new ResponseDTO(true, organisationservice.addOrganisationDetails(organisationDto)));

 }
}