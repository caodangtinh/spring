package com.tinhcao.spring.autowire.byconstructor.domain;

public class Performer {
	private Instrument instrument;

	public Performer(Instrument instrument) {
		this.instrument = instrument;
	}

	public Instrument getInstrument() {
		return instrument;
	}

}
