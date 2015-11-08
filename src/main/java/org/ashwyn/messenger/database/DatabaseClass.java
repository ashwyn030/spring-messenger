package org.ashwyn.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.ashwyn.messenger.model.Message;

public class DatabaseClass {
	
	private static Map<Long, Message> messages=new HashMap<Long, Message>();
	//private static Map<Long, Profile profile=new HashMap<Long, Message>();

	public static Map<Long, Message> getMessages() {
		return messages;
	}
	
	/*public static Map<Long, Profile> getProfiles() {
		return profiles;
	}*/

}
