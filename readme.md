# Student Information Management System

- This is our SIA (System Integration and Architecture) project, which was given 1 week and 2 days for development.

## Setup

clone repo

```bash
git clone https://github.com/Jiseeeh/student-information-management-system.git
```

### Must have

- Netbeans 18+
- [mysql-connector.jar](https://static.javatpoint.com/src/jdbc/mysql-connector.jar) must be put under **`src\sims\database`**
- Absolute Layout - AbsoluteLayout.jar (this is **native.**)
- JDK 20

### Optional

- [flatlaf dark](https://search.maven.org/remotecontent?filepath=com/formdev/flatlaf/3.2.1/flatlaf-3.2.1.jar) must be put under **`src\`**

### Add jar files

- Right click **Libraries** and click `Add JAR/Folder`
- Pick the jar files one by one and use relative path.
- For **AbsoluteLayout.jar**
  - Right click **Libraries** and click `Add Library` and choose **AbsoluteLayout**

### Setup MYSQL

- Import the sql file at **`src\sims\database\student_ims.sql`** in **phpmyadmin**(tested) or **mysql workbench**(not tested)

### Run

- Run main file
