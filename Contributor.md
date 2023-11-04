# Guía para Contribuir al Código

A continuación, te proporcionamos una guía paso a paso para contribuir al proyecto:

1. Primero, realiza un `fork` del repositorio original.

2. Luego, clona el repositorio "forkeado" desde tu cuenta de GitHub a tu máquina local.

```sh
git clone https://github.com/tu-nombre-de-usuario/proyecto.git
cd proyecto
```

3. Crea una nueva rama en la que trabajarás en tu código.

```sh
git checkout -b nombre-de-tu-rama-nueva
```

4. Una vez que hayas escrito y modificado tu código, debes realizar un commit.

```sh
git add . # Agrega todos los nuevos cambios.
git commit -m "Descripción de lo que se ha realizado."
git push -u origin nombre-de-tu-rama-nueva
```

5. Ve a tu repositorio en GitHub y crea una solicitud de extracción (pull request). Luego, envíala para que los cambios se incorporen al proyecto principal.

> Si quieres contribuir de nuevo, despues de haber enviado el codigo:

```sh
git remote add upstream https://github.com/owner/test-project.git
git fetch upstream
git checkout main
git merge upstream/main
git checkout your-branch-name
git merge main
```

Y ya tienes todo el codigo actualizado desde el repositorio original.
