## Lecture 1 & 2: Object-Oriented Programming (OOP) Concept

This mini Java project demonstrates core OOP concepts using a small academic domain: people in a college (students and professors), courses, and college rules.

### Classes and Interfaces

- `Person` (abstract class)
  - Purpose: Base type to show abstraction, encapsulation, and inheritance.
  - Key members: `name`, `age`, `email`, `eyeColor`; abstract method `introduce()`; concrete method `sleep(...)`.
  - Implements `PartyPlanner` (see below), so all subclasses must fulfill party behaviors.

- `Student` (extends `Person`, implements `CollegeRules`)
  - Adds: `program`, `studentID`, and composition of `Course[]` with `enroll(...)`, `listCourses()`, `drop(...)`.
  - Overrides `introduce()` and implements `CollegeRules` (`getID()`, `calculatePay(...)`).
  - Implements party-planner behaviors: `canDj(...)`, `sendInvitation()`, `canBringAlcohol()`.

- `Professor` (extends `Person`, implements `CollegeRules`)
  - Adds: `department`, `facultyNummber`.
  - Overrides `introduce()` and implements `CollegeRules`.
  - Implements party-planner behaviors.

- `Course` (value object)
  - Fields: `name`, `section`, `grades`.
  - Used by `Student` to demonstrate composition ("has-a" relationship).

- `CollegeRules` (interface)
  - Constants: `MAX_COURSES = 5`, `MOTTO`.
  - Methods: `getID()`, `calculatePay(hours, rate)`.

- `PartyPlanner` (interface)
  - Methods: `canDj(...)`, `sendInvitation()`, `canBringAlcohol()`.

### How They Link Together

- Inheritance: `Student` and `Professor` inherit from `Person`. Common state/behavior lives in `Person`.
- Abstraction: `Person` is abstract with `introduce()`, letting subclasses define their own introductions.
- Encapsulation: Fields are private/protected; state is accessed via getters/setters and constructor parameters.
- Polymorphism: Variables of type `Person` or `CollegeRules` can refer to `Student` or `Professor` objects. Calls like `introduce()` or `calculatePay(...)` dispatch to the appropriate implementation at runtime.
- Composition: `Student` contains an array of `Course` objects and provides enrollment APIs.
- Interfaces: `CollegeRules` models shared rules/contract across community members; `PartyPlanner` models cross-cutting party behaviors.

### Demo (`Main`)

`Main` constructs `Student` and `Professor` instances as `Person` references, calls `introduce()`, performs safe casts to call student-specific methods (`takeExam`, `enroll`, `listCourses`), and uses the `CollegeRules` interface to calculate pay. It also demonstrates party behaviors and iterates over an array of `Person` to show polymorphism.

Run `Main` to see all concepts in action.


