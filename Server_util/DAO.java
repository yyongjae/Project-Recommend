mport java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

public class App {
    private FirebaseOptions option;
    private Firestore db; 
    private final static String PATH = "Server_util/recommend-project-db-hosting-firebase-adminsdk-uy78s-ce04978769.json";
    private final static String COLLECTION_NAME = "Project_list";

    public static void main( String[] args ) {
        App app = new App();
        try {
            app.init();
            app.select();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void init() throws Exception{
        FileInputStream refreshToken = new FileInputStream(PATH);
        option = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(refreshToken))
                .setDatabaseUrl("https://recommend-project-db-hosting-default-rtdb.firebaseio.com/")  //내 저장소 주소
                .build();
        FirebaseApp.initializeApp(option);
    }

    private void select(){
        db.collection(COLLECTION_NAME).addSnapshotListener( (target, exception)->{
            System.out.println(" - select start - ");
            target.forEach( item->{
                System.out.println("primary id : "+item.getId() + "  ||  value : " + item.getData());
            });
            System.out.println(" - select end - ");
        });
    }

}


