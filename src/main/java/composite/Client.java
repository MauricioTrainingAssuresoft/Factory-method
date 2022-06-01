package composite;

public class Client {
    public static void main(String[] args) {
        IDirectory familyPhoto = new File("photo.jpg");
        IDirectory zipCrack = new File("windows crack.zip");
        IDirectory biographyDocument = new File("my biography.doc");
        IDirectory queenSong = new File("radio gaga.mp3");
        IDirectory  shakiraSong= new File("las caderas.acc");

        Folder music = new Folder("Music");
        music.addFile(queenSong);
        music.addFile(shakiraSong);

        Folder images = new Folder("Images");
        images.addFile(familyPhoto);

        Folder multimedia = new Folder("Multimedia");
        multimedia.addFile(music);
        multimedia.addFile(images);

        Folder myThings = new Folder("My Things");
        myThings.addFile(zipCrack);
        myThings.addFile(biographyDocument);

        Folder rootDirectory = new Folder("root");
        rootDirectory.addFile(myThings);
        rootDirectory.addFile(multimedia);

        System.out.println(rootDirectory.getFile());

    }
}
