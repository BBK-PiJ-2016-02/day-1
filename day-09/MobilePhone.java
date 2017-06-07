/**
* A fancy phone that has an alarm and games
*/
public class MobilePhone extends OldPhone {
    /**
     * Amount of numbers to keep in history
     */
    private static int numberHistoryLimit = 10;

    /**
     * Array of the last dialed numbers
     */
    private String[] numberHistory = new String[numberHistoryLimit];

    /**
     * Class constructor
     * @param  brand Brand name of phone
     */
    public MobilePhone(String brand) {
        super(brand);
    }

    /**
     * Call specified number
     * @param number Which number to call
     */
    public void call(String number) {
        addNumberToCallHistory(number);
        super.call(number);
    }

    /**
     * Ring alarm
     * @param alarmName Which alarm sound to play
     */
    public void ringAlarm(String alarmName) {
        System.out.println("Ringing alarm " + alarmName + "...");
    }

    /**
     * Launch game
     * @param gameName Which game to launch
     */
    public void playGame(String gameName) {
        System.out.println("Launching game " + gameName + "...");
    }

    /**
     * Add number to call history
     * @param number number to add to call history
     */
    protected void addNumberToCallHistory(String number) {
        int callHistoryCount = getCallHistoryCount();

        if(callHistoryCount == numberHistoryLimit) {
            // At call history limit, shift all numbers up a spot
            for(int i = 0; i < callHistoryCount; i++) {
                if(i > 0 && i < numberHistoryLimit) {
                    numberHistory[i-1] = numberHistory[i];
                }
                if(i == callHistoryCount-1) {
                    numberHistory[i] = null;
                }
            }
            callHistoryCount--;
        }

        numberHistory[callHistoryCount] = number;

    }

    /**
     * Print out a list of the last called numbers
     */
    public void printLastNumbers() {
        System.out.println("Last called numbers (" + getCallHistoryCount() + "): ");
        if(numberHistory[0] == null) {
            System.out.println("> No call history");
        } else {
            for(String num:numberHistory) {
                if(num != null) {
                    System.out.println("> " + num);
                }
            }
        }
    }

    /**
     * Get the call history count
     * @return count of numbers saved in call history
     */
    private int getCallHistoryCount() {
        int count = 0;
        for(String num:numberHistory) {
            if(num != null) {
                count++;
            }
        }
        return count;
    }
}