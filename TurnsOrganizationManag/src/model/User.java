package model;

import java.util.*;

public class User {

	private String idType;
	private String id;
	private String names;
	private String lastNames;
	private String phone;
	private String adress;
	private ArrayList<Turn> turns;

	/**
	 * 
	 * @param iT
	 * @param i
	 * @param n
	 * @param l
	 * @param p
	 * @param a
	 */
	public User(String iT, String i, String n, String l, String p, String a) {
		
		idType = iT;
		turns = new ArrayList<Turn>();
		// TODO - implement User.User
		throw new UnsupportedOperationException();
	}

	public String getIdType() {
		return this.idType;
	}

	public String getId() {
		return this.id;
	}

	public String getNames() {
		return this.names;
	}

	public String getLastNames() {
		return this.lastNames;
	}

	public String getPhone() {
		return this.phone;
	}

	public String getAdress() {
		return this.adress;
	}

}