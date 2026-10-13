Java Full-Stack Learning & Build Roadmap

> **Project period:** October 13, 2026 – December 30, 2026  
> **Developer:** Sai  
> **Goal:** Learn Java full-stack development by building a drawing-focused AI application, one verified feature at a time.

## 1. Project Vision

**SketchTale AI** is a planned web application that helps users turn ideas into drawing-friendly outputs. Users can describe an idea in their own language, refine the prompt, select a visual style, and generate an illustration. A guided drawing-learning area and printable storybook workflow are planned as later modules.

This project is being built as a learning project. Features will be marked complete only after implementation and testing.

### Problem to solve

People may have an idea but struggle to describe it clearly to an AI tool. Beginners who want to practise drawing may also need a structured path from simple shapes to more detailed artwork. Writers and children's-book creators may want a smoother workflow from story idea to printable pages.

### Intended users

- Beginner artists who want guided drawing practice
- Writers and creators planning illustrated children's books
- People who want to turn multilingual ideas into clearer illustration prompts

### Planned differentiators

- Multilingual prompt input and clarification
- Prompt refinement before image generation
- Four planned output styles: line art, rough pencil sketch, clean coloring outline, and graphite-style artwork
- Beginner-to-advanced drawing practice guidance
- A future story-to-printable-book workflow

> **Originality note:** Similar AI art, prompt-writing, drawing tutorial, and book-creation products already exist. The project's value will come from its focused workflow, usability, and the quality of its implementation—not from claiming that every feature is entirely new.

---

## 2. Planned Technology Stack

### MVP stack — learn these first

| Area | Technology | Why it is needed |
|---|---|---|
| Frontend structure | HTML5 | Forms, pages, semantic content |
| Frontend styling | CSS3 | Layout, responsive design, accessible UI |
| Frontend behaviour | JavaScript ES6+ | Validation, events, API requests, rendering results |
| Backend | Java | Application logic, validation, service classes |
| Backend framework | Spring Boot | REST APIs and application configuration |
| Database | PostgreSQL or MySQL | Store prompts, projects, preferences, and metadata |
| Persistence | Spring Data JPA / Hibernate | Map Java objects to database records |
| API testing | Postman | Test endpoints and error responses |
| Automated tests | JUnit | Verify business logic and API behaviour |
| Version control | Git and GitHub | Track changes, branches, issues, and documentation |

### Add when the MVP needs them

| Technology | When to add it |
|---|---|
| AI text API | When prompt refinement is ready |
| AI image-generation API | When prompt and style selection work reliably |
| PDF-generation library | When printable pages are implemented |
| Spring Security and JWT | Before adding real user accounts |
| React | Optional later frontend upgrade; not required for the first MVP |
| Docker | After the application runs locally and configuration is understood |
| AWS or another cloud host | During deployment |
| TypeScript, Redux Toolkit, Tailwind | Optional; only add if there is a clear need |

### Postpone until there is a real reason

Spring Cloud microservices, Kafka, WebFlux, Redis distributed caching, Eureka/Gateway, Resilience4j, advanced distributed transactions, and complex system design are **not MVP requirements**. Learn them later if a target role or a genuine project requirement calls for them.

---

## 3. Feature Roadmap

### MVP — build and verify first

- [ ] **F01 — Project setup:** Create repository, folders, README, `.gitignore`, and initial commits.
- [ ] **F02 — Prompt form:** User enters an idea, selects a preferred language, and chooses a style.
- [ ] **F03 — Input validation:** Reject blank or excessively long prompts and show useful messages.
- [ ] **F04 — Prompt preview:** Display the original prompt and a structured prompt preview.
- [ ] **F05 — Save project:** Store a project and its prompt details in the database.
- [ ] **F06 — Project history:** List saved projects and view a project's details.
- [ ] **F07 — Edit and delete:** Allow users to update or remove saved projects.
- [ ] **F08 — Backend API:** Implement and test REST endpoints with clear status codes.
- [ ] **F09 — AI prompt refinement:** Integrate a text-generation API and handle errors and usage limits.
- [ ] **F10 — Image generation:** Integrate an image API for at least one style; add other styles only after testing.
- [ ] **F11 — Error handling:** Provide useful UI messages for network, validation, and API failures.
- [ ] **F12 — Testing:** Add JUnit tests and API tests; manually test the complete user flow.
- [ ] **F13 — Deployment:** Deploy the MVP, document configuration, and verify the hosted version.
- [ ] **F14 — Demo documentation:** Add screenshots, setup steps, architecture notes, and a short demo.

### Later enhancements

- [ ] **E01 — Four style presets:** Line art, rough pencil, clean coloring outline, graphite-style.
- [ ] **E02 — Drawing mentor:** Beginner, intermediate, advanced, and pro practice paths.
- [ ] **E03 — Step-by-step lessons:** Shapes, proportions, facial features, shading, and practice exercises.
- [ ] **E04 — Storybook workspace:** Break a story into scenes and associate each scene with an illustration.
- [ ] **E05 — Printable PDF:** Export a tested layout with page sizes, margins, text, and images.
- [ ] **E06 — Authentication:** Add secure accounts only after the core workflow is stable.
- [ ] **E07 — Accessibility and responsive polish:** Keyboard support, readable contrast, and mobile layout.
- [ ] **E08 — Usage controls:** Apply reasonable request limits and display API failures clearly.

**Scope rule:** A smaller, tested, deployed MVP is better than a large list of unfinished features. If time gets tight, defer enhancements rather than sacrificing testing or the core workflow.

---

## 4. Learning Modules

A module is complete only when I can explain the concept, implement a small example without copying, use it in the project, and debug a basic failure.

### Frontend

- [ ] HTML: document structure, forms, inputs, labels, semantic elements
- [ ] CSS: selectors, box model, spacing, Flexbox, Grid, responsive basics
- [ ] JavaScript: variables, functions, arrays, objects, conditions, loops
- [ ] JavaScript: DOM, events, form validation, modules, `fetch`, promises, `async/await`
- [ ] Browser developer tools: inspect elements, network requests, and console errors

### Core Java and problem solving

- [ ] Variables, data types, operators, conditions, loops
- [ ] Methods, arrays, strings, basic problem solving
- [ ] Classes, objects, constructors, encapsulation
- [ ] Inheritance, polymorphism, abstraction, interfaces
- [ ] Exception handling and debugging
- [ ] Collections and generics basics
- [ ] File handling and basic date/time APIs
- [ ] DSA: arrays, strings, searching, sorting, hashing, recursion basics
- [ ] DSA: linked lists, stacks, queues, trees basics as time allows
- [ ] Complexity basics: time and space complexity

### Backend

- [ ] HTTP, JSON, request/response, status codes
- [ ] Spring Boot project structure and configuration
- [ ] REST controllers, service classes, repository layer
- [ ] CRUD APIs and validation
- [ ] SQL: `SELECT`, filtering, sorting, joins, grouping, subqueries
- [ ] Database design, primary/foreign keys, constraints, indexes basics
- [ ] JPA entities, repositories, relationships basics
- [ ] Error handling and application logging
- [ ] JUnit tests and Postman API testing

### Professional engineering

- [ ] Git: status, add, commit, pull, push, branches, merge, conflict resolution
- [ ] Readme and API documentation
- [ ] Requirement breakdown and task estimation
- [ ] Bug reproduction, root-cause analysis, and regression testing
- [ ] Environment variables and secret management; never commit API keys
- [ ] Basic security, input validation, and safe error messages
- [ ] Deployment and post-deployment smoke testing
- [ ] Communicate blockers early and record decisions

### Aptitude, communication, and CS fundamentals

- [ ] Quantitative aptitude practice
- [ ] Logical reasoning practice
- [ ] Verbal ability and reading comprehension
- [ ] Explain one technical concept in simple English
- [ ] Explain the project architecture and a bug fix aloud
- [ ] DBMS, operating systems, computer networks fundamentals
- [ ] Practice behavioural examples: ownership, teamwork, deadlines, learning from mistakes

---

## 5. Timeline: October 13 – December 30, 2026

Dates are targets, not guarantees. Adjust based on demonstrated understanding and actual progress.

| Dates | Learning focus | Project deliverable | Exit check |
|---|---|---|---|
| **Oct 13–18** | Git basics, HTML structure/forms, Java fundamentals revision | Repository, project skeleton, initial UI wireframe | Explain the problem, users, MVP, and repository structure |
| **Oct 19–25** | CSS, responsive layout, JavaScript basics | Prompt form with style selector and validation | Form works without a tutorial open |
| **Oct 26–Nov 1** | Java methods, OOP foundations, SQL basics | Define project data model and database schema | Explain classes, keys, and basic queries |
| **Nov 2–8** | Spring Boot, HTTP, REST, Postman | First API endpoint and CRUD plan | Test endpoint and explain request/response |
| **Nov 9–15** | JPA, repositories, service layer, error handling | Save and retrieve projects from the database | Create, read, update, and delete work locally |
| **Nov 16–22** | JavaScript `fetch`, async requests, API integration | Connect frontend to backend | Complete the end-to-end save/view flow |
| **Nov 23–29** | AI API concepts, secrets, validation, failure handling | Prompt refinement prototype; image generation if feasible | Demonstrate success and failure paths |
| **Nov 30–Dec 6** | JUnit, Postman regression tests, debugging | Tests for core business logic and API flow | Reproduce and fix a bug; rerun tests |
| **Dec 7–13** | Deployment basics, environment configuration, security basics | Deploy a working MVP if stable | Verify the deployed flow without exposing secrets |
| **Dec 14–20** | Polish, accessibility, documentation, interview practice | README, screenshots, API notes, project demo | Explain design choices and limitations honestly |
| **Dec 21–30** | Revision, DSA, mock interviews, release checks | MVP release tag and known-issues list | Fresh setup/deployment instructions work; demo is repeatable |

### Daily time budget — starting template

Adapt the hours to energy, sleep, and AFCAT preparation. Avoid pretending that every day will be equally productive.

- [ ] AFCAT preparation: target 3 hours
- [ ] Technical learning: target 1–1.5 hours
- [ ] DSA/coding practice: target 1 hour
- [ ] Project implementation/testing: target 1.5–2.5 hours
- [ ] English communication and revision: target 20–30 minutes

If the full schedule does not fit a day, complete one small, defined task and record what remains. Do not compensate by destroying sleep.

---

## 6. Daily Work Log

Copy this section for each study day.

### Date: `YYYY-MM-DD`

- [ ] **Learn:** Concept/module:
- [ ] **Practise:** Small exercise completed without copying:
- [ ] **Build:** Project task / issue ID:
- [ ] **Test:** Expected result vs actual result:
- [ ] **Debug:** Bug, root cause, and fix (if applicable):
- [ ] **Git:** Commit hash or commit message:
- [ ] **Explain:** What I can now explain in my own words:
- [ ] **Next task:** One specific task for the next session:

**Daily outcome:** `Not started / In progress / Tested / Blocked`

**Blocker and next action:**  
`Describe the blocker, what was tried, and the next concrete action.`

---

## 7. Definition of Done

A feature is **not** complete just because the page looks right or the code compiles.

- [ ] Requirement and acceptance criteria are written down.
- [ ] Main success path works.
- [ ] Invalid input is handled.
- [ ] Relevant error states are handled.
- [ ] Data is persisted correctly when required.
- [ ] Tests or repeatable manual checks pass.
- [ ] No API key or secret is committed.
- [ ] Code is committed to Git with a meaningful message.
- [ ] README/API notes are updated if behaviour changed.
- [ ] I can explain the implementation and at least one design choice.

---

## 8. Release Checklist

### Before calling the MVP released

- [ ] A new developer can follow the README to run the project.
- [ ] Required software versions and setup steps are documented.
- [ ] Database setup and configuration are documented.
- [ ] Secrets are supplied through environment variables/configuration, not source control.
- [ ] Core user flow works from the UI through the backend and database.
- [ ] API errors are understandable and do not leak secrets.
- [ ] Tests and smoke checks pass.
- [ ] Deployed version has been checked manually.
- [ ] Screenshots or a short demo are included.
- [ ] Known limitations and future work are documented.
- [ ] Git tag/release notes are created.

### Suggested release labels

- `v0.1.0` — UI and project structure
- `v0.2.0` — Backend and database CRUD
- `v0.3.0` — Frontend/backend integration
- `v0.4.0` — AI prompt refinement prototype
- `v0.5.0` — Image-generation workflow, if stable
- `v1.0.0` — MVP release only after the release checklist passes

These are proposed milestones, not claims that releases already exist.

---

## 9. Resume Guidance

Use an honest status label:

- **In Progress:** use while building.
- **MVP Built:** use after the core workflow works.
- **Deployed:** use only when a real hosted version is accessible.
- **Tested:** describe the tests actually written and run.

### Resume description template

**SketchTale AI — AI-Assisted Drawing and Storybook Workspace**  
*Java, Spring Boot, HTML, CSS, JavaScript, SQL, Spring Data JPA*

- Building a web application to refine multilingual illustration prompts and organize drawing projects.
- Implementing REST APIs and database persistence using Java, Spring Boot, and SQL.
- Integrating an AI service for prompt refinement and, subject to feasibility, illustration generation.
- Testing core workflows and documenting setup, architecture, and known limitations.

Update these bullets to match the features that are genuinely implemented. Do not claim production readiness, user adoption, or performance metrics without evidence.

---

## 10. Weekly Review

At the end of each week, answer:

1. What can I now build without following a tutorial?
2. Which project feature works end-to-end?
3. What bug did I investigate, and what was its root cause?
4. What remains blocked, and what is the next action?
5. What did I practise for DSA, aptitude, and communication?
6. What should I postpone to protect the MVP deadline?

**Working principle:** Learn → Practise → Build → Test → Debug → Explain → Commit → Review.
