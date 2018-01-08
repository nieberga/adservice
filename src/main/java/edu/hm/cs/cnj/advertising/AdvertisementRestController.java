package edu.hm.cs.cnj.advertising;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/ads")
public class AdvertisementRestController {

	@GetMapping
	ResponseEntity<String> findAd() {
		return ResponseEntity.ok("Dies ist meine Werbung !!!!");
	}
}
