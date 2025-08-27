# spring-ecommerce-productDTO

## Features
### Step 1.1
- [x] Create a Product class
  - [x] contains id: Long, name: String, price: Double, imageUrl: String
  - [x] use AtomicLong to create the Id
- [x] Create ProductController
  - [x] use @RestController to return always JSON
  - [x] Create the "Database" in the form of HashMap()
  - [x] Create CRUD operations
- [x] Create a GlobalControllerAdvise to handle Exceptions
### Step 1.2
- [x] Implement a controller that returns HTML
- [x] Detach the "Database" to be accessible by the two controllers
- [x] Create a ProductService to simulate the connection with a real DataBase
- [x] Inject the ProductService dependency to the controllers
- [x] Create a template HTML with the list of all products
- [x] Add JS for CRUD request in the frontend.
- [x] Display an image instead of a string on image URL
### Step 1.3
- [x] Configure H2 database
- [x] Create a product repository for database operation
- [x] Create a data schema and initialize and insert data to it
- [x] Modify the controller to use the new productDTO repository
## Step 1.4
- [x] Create a ProductDTO class
  - [x] contains id: Long, name: String, price: Double, imageUrl: String
  - [x] add copyFrom method to copy data from Product to ProductDTO
- [x] Create a ProductPatchDTO class for nullable fields
  - [x] contains id: Long, name: String, price: Double, imageUrl: String
- [x] Add Mappers to convert Product to ProductDTO and vice versa
- [x] Create ProductService interface
  - [x] Add ProductServiceCollection for CRUD operations with fake DB
  - [x] Add ProductServiceJDBC for the logic between the controller and the repository
  - [x] Add @Primary to the JDBC service to be used by default
- [x] Add ProductRepository for CRUD operations with the H2 database
- [x] The Repository should only handle the product entity
- [x] The service should handle the ProductDTO conversion to Product Entity and vice versa
- [x] Add extensions functions to convert Product to ProductDTO and vice versa
- [x] Add more custom exceptions
- [x] Handle custom and jdbc exceptions in the GlobalControllerAdvise
- [x] Use the Product Entity exclusively in the repository
- [x] Update the controller to use the new structure
- [x] Add logging to the app with SLF4J
- [x] Use logging instead of print statements
- [x] Add ViewErrorController to handle errors in the HTML controller
  - [x] Create a custom error page adaptable to the status and error message
  - [x] Add the same exceptions from ApiErrorController to the ViewErrorController
- [x] Add a Thymeleaf form to create a new product
- [x] Handle createProduct on @Controller and return a redirect to the product list
- [x] Use formular in the frontend for the Update and handle it with js.
- [x] Refactor html, divide the document in fragments using Thymeleaf
- [x] Refactor js
- [x] Add Pagination to the product List in @Controller
  - [x] Add a pageNumber and pageSize parameter to the product list
  - [x] Add findAllPaginated() to the service and repository
  - [x] Add countAll() to the repository, returning the total number of products
  - [x] Add a pagination bar to the product list
  - [x] Add a link to the pagination bar and a simple logic to handle the page number
### Step 2.1
- [x] Add validation to the ProductDTO
  - [x] Product Name
      - [x] Must be no more than 15 characters, including spaces. 
      - [x] Allowed special characters: ( ), [ ], +, -, &, /, _
      - [x] All other special characters are not allowed. 
      - [x] The name must be unique across all products.
  - [x] Product Price 
    - [x] Must be greater than 0.
  - [x] Product Image URL 
    - [x] Must start with http:// or https://.
  - [x] Add validation feedback for the thymeleaf form in the POST product on the ProductViewController
  - [x] Add validation feedback for the form handled by JS.
### Step 2.2
- [x] Create Member, MemberDTO and MemberMapper
  - [x] Should contain id, email and password
  - [x] The Entity should contain a default Role as a Enum for customer or admin
  - [x] Validate the fields on MemberDTO
  - [x] Add .toDTO and .toEntity inside the mapper
- [x] Create Member Table in the H2 database
- [x] Implement TokenResponseDTO and TokenRequestDTO for the auth request
- [x] Implement the Jwt token infrastructure
  - [x] Create an AuthorizationExtractor component to extract the Token from the request.
  - [x] Create a JwtTokenProvider implement methods to interact with the jwt library for create and parse tokens
- [x] Implement a member service and member Repository
  - [x] Implement the basic CRUD + validate email uniqueness
- [x] Implement an Auth service
  - [x] The service interacts with the jwt provider and the member service to find users and generate new Tokens
- [x] Implement the Member Controller
  - [x] should provide register, login and findMe endpoints
- [x] Create a new custom exception for Authorization and Forbidden
- [x] Handle the new exceptions on the Global Exception handler
### Step 2.3
- [x] create a WebMvcConfig and override addInterceptors to add checkLogin Interceptor.
  - [x] This interceptor should protect the route from products with post, put, patch and delete methods.
  - [x] The interceptor should check for a valid token
- [x] Create a default admin member on the DB
- [x] Modify the test to send the user token
- [x] Create a CartItem Entity, request and response DTO, db table, service and repository
  - [x] The CartItem should contain a productId, memberId, quantity and addedAt
  - [x] The CartItem should be able to be created, updated and deleted
  - [x] The CartItem should be able to be retrieved by memberId
  - [x] The CartItemResponseDTO should contain the product information and the quantity
  - [x] The CartItemRequestDTO should contain the productId and quantity
  - [x] Create a CartItemController to handle the cart operations
- [x] Create a Resolver to inject the memberDTO from the token
  - [x] The resolver should be able to extract the email from the token and inject it into the controller method
### Step 2.4
- [x] Create a Interceptor to check if the user is an admin
  - [x] The interceptor should check if the user is an admin and allow access to the product creation, update and delete methods
  - [x] The interceptor should check the admin controller endpoints
- [x] Create an AdminController to handle the admin operations
- [x] Create endpoints for top-products and active-members
- [x] Create AdminService to handle the admin operations

- [x] Create Integration tests for the services
