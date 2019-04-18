package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object VisualArtwork extends OntologyDef(
        iri = "http://schema.org/VisualArtwork",
        iris = Set("http://schema.org/VisualArtwork"),
        label = "VisualArtwork",
        comment = """A work of art that is primarily visual in character.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val colorist = lspace.ns.vocab.schema.colorist.property
lazy val surface = lspace.ns.vocab.schema.surface.property
lazy val depth = lspace.ns.vocab.schema.depth.property
lazy val artMedium = lspace.ns.vocab.schema.artMedium.property
lazy val penciler = lspace.ns.vocab.schema.penciler.property
lazy val width = lspace.ns.vocab.schema.width.property
lazy val height = lspace.ns.vocab.schema.height.property
lazy val artworkSurface = lspace.ns.vocab.schema.artworkSurface.property
lazy val artist = lspace.ns.vocab.schema.artist.property
lazy val artEdition = lspace.ns.vocab.schema.artEdition.property
lazy val letterer = lspace.ns.vocab.schema.letterer.property
lazy val artform = lspace.ns.vocab.schema.artform.property
}
override lazy val properties: List[LProperty] = List(colorist, surface, depth, artMedium, penciler, width, height, artworkSurface, artist, artEdition, letterer, artform)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val colorist = lspace.ns.vocab.schema.colorist.property
lazy val surface = lspace.ns.vocab.schema.surface.property
lazy val depth = lspace.ns.vocab.schema.depth.property
lazy val artMedium = lspace.ns.vocab.schema.artMedium.property
lazy val penciler = lspace.ns.vocab.schema.penciler.property
lazy val width = lspace.ns.vocab.schema.width.property
lazy val height = lspace.ns.vocab.schema.height.property
lazy val artworkSurface = lspace.ns.vocab.schema.artworkSurface.property
lazy val artist = lspace.ns.vocab.schema.artist.property
lazy val artEdition = lspace.ns.vocab.schema.artEdition.property
lazy val letterer = lspace.ns.vocab.schema.letterer.property
lazy val artform = lspace.ns.vocab.schema.artform.property
}
}