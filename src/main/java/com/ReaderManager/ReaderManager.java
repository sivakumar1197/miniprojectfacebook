package com.ReaderManager;

import com.ReaderProperty.ReaderFacebook;

public class ReaderManager {

	private ReaderManager() {

	}

	public static ReaderManager Instant_ReaderManager() {

		ReaderManager RM = new ReaderManager();
		return RM;
	}

	public ReaderFacebook InstantReaderMaster() throws Exception {
		ReaderFacebook RF = new ReaderFacebook();
		return RF;
	}

}
