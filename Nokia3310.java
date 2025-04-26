import java.util.Scanner;
public class Nokia3310{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);


	System.out.println("WELCOME TO YOUR NOKIA PHONE");

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

	""";
	System.out.println(PhoneBook);
	int Eight = input.nextInt();
	
	switch (Eight) {
	
	case 8: System.out.println("Options");

	String Options = """
	1. Type of view.
	2. Memory status.

	""";
	System.out.println(Options);

}
}break;

	case 2: System.out.println("Messages"); {

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

	""";

	System.out.println(Messages);
	int Seven = input.nextInt();

	switch (Seven) {

	case 7: System.out.println("Message settings");

	String MessageSettings = """

	1. Set 1.
	2. Common.
	
	""";
	System.out.println(MessageSettings);
	int One = input.nextInt();

	switch (One) {
	
	case 1: System.out.println("Set 1");

	String Set1 = """

	1. Message center number.
	2. Messages sent as.
	3. Message vaildity.

	""";
	System.out.println(Set1);break;
	
	case 2: System.out.println("Common");

	String Common = """

	1. Delivery reports.
	2. Reply via same centre.
	3. character support.

	""";
	System.out.println(Common);break;
}
}

}break;
	case 3: System.out.println("Chat");break;
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

	""";
	System.out.println(CallRegister);
	int Five = input.nextInt();

	switch (Five) {

	case 5: System.out.println("Show call duration");
	String ShowCallDuration = """

	1. Last call duration.
	2. All calls'duration.
	3. Received calls'duration.
	4. Dialled calls'duration.
	5. Clear timers.
	
	""";
	System.out.println(ShowCallDuration);break;


	case 6: System.out.println("Show call costs");
	String ShowCallCosts = """

	1. Last call cost.
	2. All call's cost.
	3. Clear counters.
	
	""";
	System.out.println(ShowCallCosts);break;

	case 7: System.out.println("Call cost settings");
	String CallCostSettings = """

	1. Call cost limit.
	2. Show costs in.
	
	""";
	System.out.println(CallCostSettings);break;

}break;
	case 5: System.out.println("Tones"); {
	
	String Tones = """
	1. Missed calls.
	2. Received calls.
	3. Dialled numbers.
	4. Erase recent call lists.
	5. Show call duration.
	6. Show call costs.
	7. Call cost settings.
	8. Prepaid credit.

	""";
	System.out.println(Tones);

}break;
	case 6: System.out.println("Settings"); {
	
	String Settings = """
	1. Call Settings.
	2. Phone settings.
	3. Security settings.
	4. Restore factory settings.

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

}break;
	case 12: System.out.println("Profiles");break;
	case 13: System.out.println("SIM services");break;
}



}

}