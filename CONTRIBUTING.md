# Contributing Guide

Obrigado por contribuir! Seguir estas diretrizes mantém o projeto organizado e fácil de manter.

## 📋 Processo

1. **Faça um fork** do repositório
2. **Crie uma branch** para sua feature/fix
3. **Commit** com mensagens claras (Conventional Commits)
4. **Push** para sua fork
5. **Abra uma PR** descrevendo suas mudanças

## 🎯 Conventional Commits

```bash
feat(auth):    adiciona autenticação JWT
fix(api):      corrige null pointer exception
docs(readme):  atualiza instruções
test(service): adiciona testes unitários
chore(deps):   atualiza Spring Boot para 3.4.1
refactor:      reorganiza estrutura de pastas
perf(cache):   melhora performance de queries
```

## ✅ Pre-commit Checklist

- [ ] Testes locais passam: `mvn test`
- [ ] Cobertura mantém ≥ 80%: `mvn jacoco:report`
- [ ] Código segue style: `mvn checkstyle:check`
- [ ] Sem bugs novos: `mvn spotbugs:check`
- [ ] Branches estão atualizadas com `main`

## 📝 Regras de PR

- **Título**: use Conventional Commits
- **Descrição**: explique O QUÊ e POR QUÊ (não apenas COMO)
- **Linked Issues**: referencie issues relacionadas com `Fixes #123`
- **Reviewers**: aguarde aprovação de pelo menos 1 reviewer

## 🐛 Relatando Bugs

1. Verifique se o bug já não foi reportado
2. Use o template de issue
3. Inclua: versão Java, SO, passos para reproduzir
4. Compartilhe logs e screenshots se aplicável

## 💡 Sugestões de Features

- Abra uma discussion antes de um PR grande
- Explique o caso de uso
- Aguarde feedback da equipe

## 📚 Ambiente Local

```bash
git clone <seu-fork>
cd java-bootstrap
mvn clean verify    # Build completo com quality gates
docker-compose up   # Stack local (em breve)
```

---

**Dúvidas?** Abra uma discussion ou entre em contato com os maintainers.

Obrigado por melhorar este projeto! 🚀
