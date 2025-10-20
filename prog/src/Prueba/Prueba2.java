ARTISTA(ID, Nombre, Nacionalidad)
    PK(ID)

CANCION(ID, Nombre, Duracion, Fecha_lanzamiento, N-Artista)
    PK(ID)
    FK(Artista -> ARTISTA(ID))

COLABORACION(Artista, Cancion)
    PK(Artista, Cancion)

    