[![Pipelines CI](https://img.shields.io/bitbucket/pipelines/nubeclick/posnubeclick/develop.svg)](https://bitbucket.org/nubeclick/posnubeclick/addon/pipelines/home#!/)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/1d504cf174df424c9e6f645bfce890cf)](https://www.codacy.com?utm_source=git@bitbucket.org&amp;utm_medium=referral&amp;utm_content=nubeclick/posnubeclick&amp;utm_campaign=Badge_Grade)

[Contribution-Instructions]: /Contributing.md "title".

# For developers who want to contribute please refer to the instructions [here][Contribution-Instructions] 

# ACME-POS

## Purpose of the system.

It is a generic sales system that can be adapted to any type of business where sales are at the counter, which will handle:

1. Roles
2. Users
3. Suppliers.
4. Deposits.
5. Inventory.
6. Shopping.
7. Sellers.
8. Customers.
9. Sales.
10. Movements (Charges-Discharges inventory, CxC sales, CxP purchases, Expenses).
11. Configuration (directory of data and formats, connection properties, creation of users, vendors, repositories).
12. Reports (inventory, purchase, sales, sellers, cats, salaries or payments).

Pending to be analyzed: Taxes, CxC, CxP.

2. System functions.

CRUD operations will be performed on all modules of the system.

2.1. Roles

From the configuration menu, it will allow creating and assigning the level of the role, which will enable access to the system according to the level of the users.

2.2 Users

It will be accessible from the configuration menu. When creating or modifying users, the access levels to the different system features (role) must be parameterized.

2.3 Suppliers.

It will be accessible from the main menu, in it you can specify the agreements with the providers, such as credit days and credit limit.

2.4 Depots.

Available through the configuration menu, it will be used to specify how many deposits are available.

2.5 Inventory.

Available in the main menu, when creating the inventory products you must specify in which deposit they will be stored.

** Only allow to modify and eliminate movements to the user that complies with the permissions

necessary.

2.6 Shopping.

Accessible from the main menu, process merchandise purchases.

2.7 Sellers

Available from configuration menu, allows the creation of sellers, you can specify the salaries and commissions of the sellers.

2.8 Customers.

Available from the main menu, in it you can specify the agreements with customers, such as credit days and credit limit.

2.9 Sales.

Available from the main menu, make the sale of products, specifying the seller, the customer, the deposit with which to work and specify the products to add.

2.10 Movements.

Accessible from the main menu, in this module several options will be handled:

to. Inventory Movements:

Charges-Discharges transfer between deposits.

b. Sales:

Sales cuts (closing of working day, cash cut).

Accounts receivable.

Reprinting of movements.

c. Purchases:

Debts to pay.


Reprinting of movements.

d. Expenses:

Payments for expenses (purchase internal supplies, payment for services).

Payments of salaries and commissions.

2.11 Configuration.

Accessible from the toolbar on the main screen for users who comply with the necessary permissions, from here they will configure and create the basic parameters for the operation of the system. These parameters are:

to. Connection properties.

b. Directory of data and formats.

c. Creation of users.

d. Vendors

and. Deposits.

** Only allow to modify and eliminate movements to the user that complies with the permissions

necessary.

2.12 Reports.

Accessible from the main menu, for users who comply with the necessary permits, reports of:

to. Sales: cash cuts.

b. Purchase.

c. Inventory.

d. Vendors

e. Expenses and Salaries