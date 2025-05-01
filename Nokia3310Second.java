import java.util.Scanner;
public class Nokia3310Second{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);


	System.out.println("WELCOME TO YOUR NOKIA PHONE");
	
	while (true) {
		
	System.out.println("LIST OF MENU FUNTIONS");


	String MENU = """
	1. Phone book.
	2. Massages.
	3. Chat.
	4. Call register.
	5. Tones.
	6. Settings.
	7. Call divert.
	8. Games.
	9. Calculator.
	10. Remainders.
	11. Clocks.
	12. Profiles.
	13. SIM services.
	

	""";
	System.out.println(MENU);
	int menu = input.nextInt();


	switch(menu) {
	case 1: System.out.println("Phone book"); {
	
	String PhoneBook = """
	1. Search.
	2. Services Nos.
	3. Add name.
	4. Erase.
	5. Edit.
	6. Assign tone.
	7. Send b'card.
	8. Options.
	9. Speed dials.
	10. Voice tags.
	11: Back.
	
	""";
	System.out.println(PhoneBook);
	int Eight = input.nextInt();
	
	switch (Eight) {
	case 1: System.out.println("Search");break;
	case 2: System.out.println("Services Nos");break;
	case 3: System.out.println("Add name");break;
	case 4: System.out.println("Erase");break;
	case 5: System.out.println("Edit");break;
	case 6: System.out.println("Assign tone");break;
	case 7:	System.out.println("Send b'card");break;
	
	case 8: System.out.println("Options"); 

	String Options = """
	1. Type of view.
	2. Memory status.
	3. Back.
	
	""";
	
	System.out.println(Options);
	Eight = input.nextInt();
	switch (Eight){
	
	case 1:	System.out.println("Type of view");break;
	case 2:	System.out.println("Memory status");break;
	case 3:	System.out.println("Back");break;
}
	
	
	case 9:	System.out.println("Speed dials");break;
	case 10: System.out.println("Voice tags");break;
	default: System.out.println("invalid number");break;
}
}break;

	case 2: System.out.println("Messages"); 

	String Messages = """
	1. Write massages.
	2. Inbox.
	3. Outbox.
	4. Picture massages.
	5. Templates.
	6. Smileys.
	7. Message settings.
	8. Info service.
	9. Voice mailbox number.
	10.Service command editor.
	11. Back.
	
	""";

	System.out.println(Messages);
	int Seven = input.nextInt();

	switch (Seven) {
	case 1: {
		  boolean messaging = true;
	      	  while (messaging) {
		System.out.println(""" 
			Write massages 
			
			0. Back
				""");
		int chatBack = input.nextInt();
		switch (chatBack) {
		   case 0 :messaging = false; break;

		   default : System.out.println("Invalid selection");
			}
		   }
	}break;

	case 2: {
		  boolean Inboxing = true;
	      	  while (Inboxing) {
		System.out.println(""" 
			Inbox 
			
			0. Back
				""");
		int chatBack = input.nextInt();
		switch (chatBack) {
		   case 0 :Inboxing = false; break;

		   default : System.out.println("Invalid selection");
			}
		   }
	}break;

	case 3: {
		  boolean Outboxing = true;
	      	  while (Outboxing) {
		System.out.println(""" 
			Outbox 
			
			press 0. Back
				""");
		int chatBack = input.nextInt();
		switch (chatBack) {
		   case 0 :Outboxing = false; break;

		   default : System.out.println("Invalid selection");
			}
		   }
	}break;

	case 4: {
		  boolean Picture = true;
	      	  while (Picture) {
		System.out.println(""" 
			Picture massages 
			
			press 0. Back
				""");
		int chatBack = input.nextInt();
		switch (chatBack) {
		   case 0 :Picture = false; break;

		   default : System.out.println("Invalid selection");
			}
		   }
	}break;

	case 5: {
		  boolean Templating = true;
	      	  while (Templating) {
		System.out.println(""" 
			Templates 
			
			press 0. Back
				""");
		int chatBack = input.nextInt();
		switch (chatBack) {
		   case 0 :Templating = false; break;

		   default : System.out.println("Invalid selection");
			}
		   }
	}break;

	case 6: {
		  boolean Smileying = true;
	      	  while (Smileying) {
		System.out.println(""" 
			Smileys 
			
			press 0. Back
				""");
		int chatBack = input.nextInt();
		switch (chatBack) {
		   case 0 :Smileying = false; break;

		   default : System.out.println("Invalid selection");
			}
		   }
	}break;

	case 7: System.out.println("Setting"); {
		  boolean Setting = true;
	      	  while (Setting) {
		System.out.println(""" 
			Message settings
			
			1. Set 1.
			2. Common.
			3. Back.
	
			press 0. Back
				""");
		int chatBack = input.nextInt();
		switch (chatBack) {
		   case 0 :Setting = false; break;

		   default : System.out.println("Invalid selection");
			}
	}	   }
	
 	System.out.println(Setting);break;

	int One = input.nextInt();

	switch (One) {

		case 1: {
			   boolean Setting  = true;
	      	 	   while (Setting ) {
		     System.out.println(""" 
			Set 1
			
			1. Message center number.
			2. Messages sent as.
			3. Message vaildity.
	
	
			press 0. Back
				""");
		int setBack = input.nextInt();
		switch (setBack) {
		   case 0 :Setting  = false; break;

		   default : System.out.println("Invalid selection");
			}
		   }
	}break;

	
	//case 1: System.out.println("Set 1");

	//String Set1 = """

	//1. Message center number.
	//2. Messages sent as.
	//3. Message vaildity.
	//4. Back.
	
	//""";
	//System.out.println(Set1);break;
	
	//case 2: System.out.println("Common");

	//String Common = """

	//1. Delivery reports.
	//2. Reply via same centre.
	//3. character support.
	//5. Back.
	//""";
	//System.out.println(Common);break;
	case 8:	System.out.println("Info service");break;
	case 9:	System.out.println("Voice mailbox number");break;
	case 10: System.out.println("Service command editor");break;



}
}break;

	case 3: {
		  boolean chatting = true;
	      	  while (chatting) {
		System.out.println(""" 
			View your chats here 
			
			0. Back
				""");
		int chatBack = input.nextInt();
		switch (chatBack) {
		   case 0 :chatting = false; break;

		   default : System.out.println("Invalid selection");
			}
		   }
	}break;

	case 4: System.out.println("Call register");

	String CallRegister = """
	1. Missed calls.
	2. Received calls.
	3. Dialled numbers.
	4. Erase recent call lists.
	5. Show call duration.
	6. Show call costs.
	7. Call cost settings.
	8. Prepaid credit.
	9. Back.
	""";
	
	System.out.println(CallRegister);
	
	int Five = input.nextInt();

	switch (Five) {
		case 1: {
		  boolean callings = true;
	      	  while (callings) {
		System.out.println(""" 
			View your Missed calls here 
			
			0. Back
				""");
		int callBack = input.nextInt();
		switch (callBack) {
		   case 0 :callings = false; break;

		   default : System.out.println("Invalid selection");
			}
		   }
	}break;

	case 2: {
		  boolean Receiving = true;
	      	  while (Receiving) {
		System.out.println(""" 
			View your Received calls here 
			
			0. Back
				""");
		int callBack = input.nextInt();
		switch (callBack) {
		   case 0 :Receiving = false; break;

		   default : System.out.println("Invalid selection");
			}
		   }
	}break;





	case 3:  {
		  boolean Dialling = true;
	      	  while (Dialling) {
		System.out.println(""" 
			Dialled numbers
			
			0. Back
				""");
		int callBack = input.nextInt();
		switch (callBack) {
		   case 0 :Dialling = false; break;

		   default : System.out.println("Invalid selection");
			}
		   }
	}break;

	case 4:   {
		  boolean recent = true;
	      	  while (recent) {
		System.out.println(""" 
			Erase recent call lists
			
			0. Back
				""");
		int callBack = input.nextInt();
		switch (callBack) {
		   case 0 :recent = false; break;

		   default : System.out.println("Invalid selection");
			}
		   }
	}break;


	case 5: System.out.println("Show call duration");
	String ShowCallDuration = """

	1. Last call duration.
	2. All calls'duration.
	3. Received calls'duration.
	4. Dialled calls'duration.
	5. Clear timers.
	6. Back.
	
	""";
	
	System.out.println(ShowCallDuration);break;


	case 6: System.out.println("Show call costs");
	String ShowCallCosts = """

	1. Last call cost.
	2. All call's cost.
	3. Clear counters.
	4. Back.
	
	""";
	System.out.println(ShowCallCosts);break;

	case 7: System.out.println("Call cost settings");
	String CallCostSettings = """

	1. Call cost limit.
	2. Show costs in.
	3. Back.
	
	""";
	System.out.println(CallCostSettings);break;
	case 8:	System.out.println("Prepaid credit");break;
	case 9:	System.out.println("Back");break;

}break;
	case 5: System.out.println("Tones"); {
	
	String Tones = """
	1. Ringing tone.
	2. Ringing volume.
	3. Incoming call alert.
	4. Composer.
	5. Message alert tone.
	6. Keypad tones.
	7. Warning and game tones.
	8. Vibrating alert.
	9. Screen saver.
	10. Back.
	""";
	System.out.println(Tones);
	int Four = input.nextInt();

	switch (Four) {

	case 1: System.out.println("Ringing tone");break;
	case 2: System.out.println("Ringing volume");break;
	case 3: System.out.println("Incoming call alert");break;
	case 4: System.out.println("Composer");break;
	case 5: System.out.println("Message alert tone");break;
	case 6: System.out.println("Keypad tones");break;
	case 7: System.out.println("Warning and game tones");break;
	case 8: System.out.println("Vibrating alert");break;
	case 9: System.out.println("Screen saver");break;
	case 10: System.out.println("Back");break;

}
}break;
	case 6: System.out.println("Settings"); {
	
	String Settings = """
	1. Call Settings.
	2. Phone settings.
	3. Security settings.
	4. Restore factory settings.
	5. Back.
	""";
	System.out.println(Settings);
	int Six = input.nextInt();

	switch (Six) {

	case 1: System.out.println("Call Settings");
	String CallSettings = """

	1. Automatic redial.
	2. Speed dialling.
	3. Call waiting options.
	4. Own number sending.
	5. Phone line in use.
	6. Automatic answer.
	
	""";
	System.out.println(CallSettings);break;


	case 2: System.out.println("Phone settings");
	String PhoneSettings = """

	1. Language.
	2. Cell info display.
	3. Welcome note.
	4. Network selection.
	5. Lights.
	6. Confirm SIM service actions.
	
	""";
	System.out.println(PhoneSettings);break;
	
	case 3: System.out.println("Security settings");
	String SecuritySettings = """

	1. PIN code request.
	2. Call barring service.
	3. Fixed dialling.
	4. Closed user group.
	5. Phone security.
	6. Change access codes.
	
	""";
	System.out.println(SecuritySettings);break;
	case 4: System.out.println("Restore factory settings");
	case 5:	System.out.println("Back");break;
}
}break;
	case 7: System.out.println("Call divert");break;
	case 8: System.out.println("Games");break;
	case 9: System.out.println("Calculator");break;
	case 10: System.out.println("Remainders");break;
	
	case 11: System.out.println("Clocks"); {

	String Clocks = """

	1. Alarm clock.
	2. Clock settings.
	3. Date setting.
	4. Stopwatch.
	5. Countdown timer.
	6. Auto update of date and time.
	
	""";
	System.out.println(Clocks);
	int Eleven = input.nextInt();

	switch (Eleven) {

	case 1: System.out.println("Alarm clock");break;
	case 2: System.out.println("Clock settings");break;
	case 3: System.out.println("Date setting");break;
	case 4: System.out.println("Stopwatch");break;
	case 5: System.out.println("Countdown timer");break;
	case 6: System.out.println("Auto update of date and time");break;
	


}
}break;
	case 12: System.out.println("Profiles");break;
	case 13: System.out.println("SIM services");break;
	default: System.out.println("invalid number");break;


}

}


}
}

