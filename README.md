# songr
  App by Peter Tynan
  
## Operation
  After cloning the repo to your machine, cd to the top level of the repo directory.
  From there, run ./gradlew bootRun to start the server.
  In your browser, use localhost:8080/ as the path to reach any of the following endpoints:
  
  There is some SQL setup necessary before using the /albums endpoint.
  First you will need to setup a new database, eg. songr, and run the database using PSQL.
  Upon running the code for the first time, go into songr/src/main/resources/application.properties file and uncomment the 2nd line. After the server is up and running, comment out that line again.
  
  Use the following format to insert new albums into the album table.
  INSERT INTO album (artist, image_url, length, song_count, title) VALUES ('Porter Robinson', 'https://upload.wikimedia.org/wikipedia/en/a/ac/Porter_Robinson_Spitfire.jpg', 3594, 11, 'Spitfire');
  INSERT INTO album (artist, image_url, length, song_count, title) VALUES ('Finger Eleven', 'https://upload.wikimedia.org/wikipedia/en/3/38/Fingereleventhemvs.youvs.me.jpg', 2424, 11, 'Them vs. You vs. Me');
   INSERT INTO album (artist, image_url, length, song_count, title) VALUES ('Red Hot Chili Peppers', 'https://upload.wikimedia.org/wikipedia/en/d/df/RedHotChiliPeppersCalifornication.jpg',3384, 15, 'Californication');

## Endpoints
    /hello - returns "hello world!", confirmation that the server is running.
    /capitalize/{input} - {input} any string, returns a string containing an all-capital letters version of whatever is input.
    /reverse?sentence={sentence} - {sentence} is an input of any sentence, preferably with multiple words. Returns a string of that sentence but the words are in reverse order.
    /album - returns the list of albums currently stored in the database, with information about each album.
