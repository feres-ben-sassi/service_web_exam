package tn.feres;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace="http://ws.offreTravail.tn", name="OffreTravail", portName="OffreTravailPort", serviceName="OffreTravailService")
public class ServiceOffre {

	@WebResult(name="offre")
	public Offre afficheOffre() {
		return new Offre();
	}

	@WebResult(name="codeValidation")
	public int creerCompteOffreTravail(@WebParam(name="nouveauCompteOffreTravail") Offre nouveauCompteOffreTravail) {
		return 5;
	}

}

	
	

