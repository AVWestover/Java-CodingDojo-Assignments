public class TestProject{
    public static void main(String[] args) {
        //creating new instances
        Project museum = new Project();
        Project art = new Project("Paintings");
        Project transport = new Project("Transportation", "Transportation of art to museum");
        //testing assignments
        museum.setName("City Art Museum");
        museum.setDescription("New city art museum preparing for grand opening");
        art.setDescription("Art displays for the new city museum");
        //elevatorpitch
        System.out.println(museum.elevatorPitch());
        System.out.println(art.elevatorPitch());
        System.out.println(transport.elevatorPitch());
        //
    }
}