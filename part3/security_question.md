## Access Control
Implement practices for session management as well as access control so that users cannot act outside their assigned permissions. 
Software engineers, customer service employees and sales employees should only have access to the information and controls they need 
to perform their jobs. Software engineers may need full access to the system to maintain and improve it. However, customer service employees 
may only need to view customer information and make changes to orders and accounts, and do not need access to the system's code base. 
Similarly, the sales clerk may only need access to sales metrics and does not need access to customer information.

## Cryptography
Sensitive data (passwords, personal customer information) it has to be stored securely using appropriate encryption methods, 
including using a secure key management system to store and manage encryption keys. Passwords should be stored as hashes rather 
than in plain text. In addition, any information that is transmitted between the client and server should be encrypted to prevent 
attackers from intercepting it. This is especially important since sensitive information, such as users home addresses and phone 
numbers, is being transmitted.

## SQL Injection
Validate and filter any data coming from the user to use in a query or command. As MySQL is being used for the database, a parameterized query
library should be used to avoid SQL injection attacks, also debug all special characters in the user input before passing it to the database. 
Similarly, with FastAPI, must be ensured that any data coming from the user is properly validated before use.

## Security Configuration
The infrastructure is deployed with Kubernetes on AWS must be properly configured. All unnecessary features should be disabled, all default 
accounts and their passwords should be changed, and error messages should not reveal too much information. Incorrect configurations can 
lead to a variety of security problems, which is why the servers, frameworks and database have to be configured with secure values.
This can be supplemented by using a security configuration checklist to ensure that the system is configured securely, and it is important 
to keep the application components updated with the latest security patches.

## Vulnerable and Outdated Components
All libraries and dependencies that are being used in Android, iOS and Next.js applications must be updated, but always keeping in mind that 
new updates may not be stable and may cause conflicts with the operation of the application, this is why it is necessary to have an inventory 
of all versions of the components used, both on the client and server side. This includes directly used components as well as nested dependencies. 
Perform periodic scans for vulnerabilities to find out if a component is outdated or vulnerable and immediately upgrade or replace it with a 
secure version.

## Identification and Authentication
Implement multi-factor authentication to prevent automated attacks using known credentials, brute force and reuse of stolen credentials.
Default credentials, particularly for administrator users, should not be implemented in the system. It is important to include a check against
weak passwords, such as verifying that a new password or the password used in the password change is not included in the list of the 10,000 worst 
passwords.
 
