package com.tutorial.contact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/contact")
public class ContactController {

	/**
	 * Using Maps
	 */
	
//	public static List<Map<String, String>> contacts = new ArrayList<Map<String,String>>();
//	
//	@GetMapping
//	public ResponseEntity<List<Map<String, String>>> getAllContacts() {
//		return ResponseEntity.ok(contacts);
//	}
//	
//	
//	@PostMapping
//	public ResponseEntity<Map<String, String>> addNew(@RequestBody Map<String, String> contact) {
//		contacts.add(contact);
//		
//		Map<String, String> response = new HashMap<String, String>();
//		response.put("status", "success");
//		return ResponseEntity.ok(response);
//	}
	

	/**
	 * Using POJO
	 */
//	public static List<Contact> contacts = new ArrayList<Contact>();
//	
//	@GetMapping
//	public ResponseEntity<List<Contact>> getAllContacts() {
//		return ResponseEntity.ok(contacts);
//	}
//	
//	
//	@PostMapping
//	public ResponseEntity<Map<String, String>> addNew(@RequestBody Contact contact) {
//		
//		if (contact.isValid()) {
//			contacts.add(contact);
//			
//			Map<String, String> response = new HashMap<String, String>();
//			response.put("status", "success");
//			return ResponseEntity.ok(response);
//		}
//		
//		Map<String, String> response = new HashMap<String, String>();
//		response.put("status", "failed");
//		response.put("details", "Contact has some missing or invalid keys");
//		return ResponseEntity.status(500).body(response);
//	}
	
	
	public static List<Contact> contacts = new ArrayList<Contact>();
	
	@GetMapping
	public ResponseEntity<Response> getAllContacts() {
		if (contacts.isEmpty()) {
			return ResponseEntity.ok(new Response(contacts, Status.SUCCESS, "No Contacts to show"));
		}
		return ResponseEntity.ok(new Response(contacts, Status.SUCCESS, ""));
	}
	
	
	@PostMapping
	public ResponseEntity<Response> addNew(@RequestBody Contact contact) {
		
		if (contact.isValid()) {
			contacts.add(contact);
			return ResponseEntity.ok(new Response(null, Status.SUCCESS, "Successfully added"));
		}
		return ResponseEntity.status(500).body(new Response(null, Status.FAILED, "Contact has some missing or invalid keys"));
	}
	

}
