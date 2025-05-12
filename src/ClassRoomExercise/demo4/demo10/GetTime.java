package ClassRoomExercise.demo4.demo10;

public interface GetTime {

    public default long getTime(){
        long start = System.currentTimeMillis();
        try {
            code();
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public void code();
}
