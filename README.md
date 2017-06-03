# calmunnist => call มัน(mun) นิดส์(nist).

A wrapper for  "org.scalaj" %% "scalaj-http" % "2.3.0" for shorten Json client calling with Json-Scala case class wrapper.
For Scala 2.11.8 to 12.12.1

Eg.
GET method
<pre> get[User](url = "https://jsonplaceholder.typicode.com/posts/1", token = "") </pre>

POST method
<pre>post(url = "http://jsonplaceholder.typicode.com/posts", json = user, token = "")</pre>

Where User is the Scala case class.

<pre>
resolvers += "Billme Artifactory" at "https://artifact.billme.in.th/artifactory/billme-public/" <br>
libraryDependencies += "th.pt" %% "calmunnist" % "1.0.0"
</pre>
