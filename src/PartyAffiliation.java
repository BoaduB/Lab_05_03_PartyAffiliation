public class PartyAffiliation {
    public static void main(String[] args) {

        String partyChoice = "";

        String party = "D - Democrat R - Republican I- Independent"; // [D,R,I,Other]

        //input partyChoice
        partyChoice = "O";

        if (partyChoice.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey");
        }
        else if (partyChoice.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant");
        }
        else if (partyChoice.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Person");
        }
        else // not a partyChoice!
        {
            System.out.println("Other");
        }
    }
}