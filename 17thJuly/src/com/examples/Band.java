package com.examples;

public class Band {
	private String bandName, drummer, keyboardPlayer;
	private String singers[], guitarists[];

	/**
	 * @param bandName
	 * @param drummer
	 * @param keyboardPlayer
	 * @param singers
	 * @param guitarists
	 */

	public void setBandDetails(String bandName, String[] singers, String[] guitarists, String drummer,
			String keyboardPlayer) {
		this.bandName = bandName;
		this.drummer = drummer;
		this.keyboardPlayer = keyboardPlayer;
		this.singers = singers;
		this.guitarists = guitarists;
	}

	void printBandDetails() {
		System.out.println("BAND DETAILS:");
		System.out.println("BAND NAME:\t" + this.bandName);
		System.out.println("Singer Names:\t" );
		for ( String x : singers) {
			System.out.println(x+"  ");
		}
		System.out.println("Guitarist Names:\t");
		for ( String x : guitarists) {
			System.out.println(x+"  ");
		}
		System.out.println("Drummer Name:\t" + this.drummer);
		System.out.println("KeyboardPlayer Name:\t" + this.keyboardPlayer);
	}
}
