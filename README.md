# NLW Pocket: Mobile - Kotlin da Rocketseat 

Desenvolvimento de uma aplicação mobile Android

Aplicativo: Nearby 

Utilizado: Android nativo com Kotlin, Android Studio, MVI + Clean Architecture, Jetpack Compose, ViewModel e Lifecycle, Navigation, Google Maps API, Flow e Coroutines, Ktor, Kotlinx Serialization, Coil, Gradle



## API

o uso da [API](https://github.com/tvinente/nearby-nlw-pocket-mobile-api) (repositório: nearby-nlw-pocket-mobile-api) é indispensável para o funcinamento desse projeto. Entretanto a API está referenciada como dependência via git submodule, para manter a organização do projeto.

### Orientações - git submodule

 Ao clonar o repositório principal, o submodule não será automaticamente clonado.

* Clonar repositório principal e inicializar os submodules

    - git clone https://github.com/seu-usuario/repositorio-principal.git (https://github.com/tvinente/nearby-nlw-pocket-mobile-kotlin)
    - cd repositorio-principal
    - git submodule init
    - git submodule update

ou
    - git clone --recurse-submodules https://github.com/seu-usuario/repositorio-principal.git (https://github.com/tvinente/nearby-nlw-pocket-mobile-kotlin)

* Atualizar um submodule

    - Entre na pasta do submodule: cd api/
    - Atualize o submodule para a versão mais recente: git pull origin main
    - Volte para o repositório principal e commit a atualização: 

        - cd ..

        - git add api/

        - git commit -m "Atualizando submodule API para a versão mais recente"

        - git push origin main


* Alterações no submodule (alterações no código da API diretamente pelo repositório principal)

    - Entre na pasta do submodule: cd api/
    - Faça as alterações necessárias e commit:

        - git add .

        - git commit -m "Alterações na API"

        - git push origin main

    - Voltar para o repositório principal e atualizar a referência do submodule:

        - cd ..

        - git add api/

        - git commit -m "Atualizando referência do submodule API"

        - git push origin main

* Remover o submodule (caso exista necessidade)

     - Remova o submodule do .gitmodules e do .git/config: git submodule deinit -f api/

     - Remova a pasta do submodule:

        - rm -rf .git/modules/api/

        - git rm -f api/

    - Commit as alterações:

        - git commit -m "Removendo submodule API"
        - git push origin main
