# Java Bootstrap Template ☕

[![CI/CD](https://github.com/yourorg/java-bootstrap/workflows/CI%2FCD%20Pipeline/badge.svg)](https://github.com/yourorg/java-bootstrap/actions)
[![Coverage](https://codecov.io/gh/yourorg/java-bootstrap/branch/main/graph/badge.svg)](https://codecov.io/gh/yourorg/java-bootstrap)
[![Java Version](https://img.shields.io/badge/java-21-blue.svg)](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.0-green.svg)](https://spring.io/projects/spring-boot)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)

Professional Java 21 project template with enterprise-grade security, testing, and DevOps automation.

## 🏗️ Architecture

```
src/
├── main/
│   ├── java/com/example/
│   │   ├── domain/          # Business logic & entities
│   │   ├── application/     # Use cases & services
│   │   ├── infrastructure/  # DB, APIs, external services
│   │   ├── adapter/         # REST controllers, repositories
│   │   └── config/          # Spring configuration
│   └── resources/
│       ├── application.yml
│       └── db/migration/
└── test/
    ├── java/               # Unit & integration tests
    └── resources/
```

## 📋 Quality Gates

| Plugin | Purpose | Status |
|--------|---------|--------|
| **Checkstyle** | Code style (Google) | ✓ Fails build |
| **SpotBugs** | Bug detection | ✓ Fails build |
| **PMD** | Code quality issues | ✓ Fails build |
| **JaCoCo** | 80% code coverage | ✓ Fails build |
| **Dependency-Check** | OWASP CVE scan | ✓ Fails build (CVSS ≥ 7) |

## 🚀 Quick Start

```bash
# Clone & build
git clone <repo>
cd java-bootstrap
mvn clean verify

# Run locally
mvn spring-boot:run

# Docker build
mvn clean package -Pdocker
docker run -p 8080:8080 java-bootstrap:1.0.0-SNAPSHOT
```

## 📝 Git Workflow

Follow [Conventional Commits](https://www.conventionalcommits.org/):

```bash
git commit -m "feat(auth): add JWT validation"
git commit -m "fix(api): resolve null pointer exception"
git commit -m "docs(readme): update setup instructions"
git commit -m "test(service): add unit tests for UserService"
git commit -m "chore(deps): upgrade Spring Boot to 3.4.1"
```

## 🛡️ Security

- Environment secrets in `.env` (git-ignored)
- OWASP Dependency Check on every build
- Alpine JRE for minimal image surface
- MaxRAMPercentage tuning for containers

## ✅ Pre-commit Checklist

- [ ] Tests pass: `mvn test`
- [ ] Coverage ≥ 80%: `mvn jacoco:report`
- [ ] Code style: `mvn checkstyle:check`
- [ ] No bugs: `mvn spotbugs:check`
- [ ] No vulnerabilities: `mvn org.owasp:dependency-check-maven:check`

## 📚 Documentation

- [Spring Boot 3.4 Guide](https://spring.io/projects/spring-boot)
- [Maven Best Practices](https://maven.apache.org/)
- [Clean Architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html)

---
Created with ❤️ for Java developers
