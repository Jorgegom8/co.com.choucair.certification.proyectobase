# Author : Jorge Armando Gómez Cardona

@stories
  Feature: Academy Choucair
    As a User, i want to learn how to automate in a screenplay at the Choucair Academy with the automation curse

    @scenario1
    Scenario Outline: Search for automation course
      Given than Armando wants to learn automation at the academy Choucair
        | strUser   | strPassword   |
        | <strUser> | <strPassword> |
      When he search for the courses on the Choucair academy platform
        | strCourse   |
        | <strCourse> |

      Then he finds the course called resources
        | strCourse   |
        | <strCourse> |

      Examples:
        | strUser    | strPassword   | strCourse               |
        | 1007291694 | Choucair2021* | Metodología Bancolombia |