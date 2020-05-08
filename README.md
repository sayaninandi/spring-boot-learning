SpringBoot ReferenceDocs:
1. Pom - dependency - sarter-web
2. restcontroller - handeling incoming web request.
3. RequestMapping - provides “routing” information.It tells Spring that any HTTP request with the / path should be mapped to the particular method.
 The @RestController annotation tells Spring to render the resulting string directly back to the caller.
 
4.@enableAutoConfiguration: ow you want to configure Spring, based on the jar dependencies that you have added.