# songr
  App by Peter Tynan
  
## Operation
  After cloning the repo to your machine, cd to the top level of the repo directory.
  From there, run ./gradlew bootRun to start the server.
  In your browser, use localhost:8080/ as the path to reach any of the following endpoints:

## Endpoints
    /hello - returns "hello world!", confirmation that the server is running.
    /capitalize/{input} - {input} any string, returns a string containing an all-capital letters version of whatever is input.
    /reverse?sentence={sentence} - {sentence} is an input of any sentence, preferably with multiple words. Returns a string of that sentence but the words are in reverse order.
