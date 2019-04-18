package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object VideoGame extends OntologyDef(
        iri = "http://schema.org/VideoGame",
        iris = Set("http://schema.org/VideoGame"),
        label = "VideoGame",
        comment = """A video game is an electronic game that involves human interaction with a user interface to generate visual feedback on a video device.""",
        `@extends` = () => List(Game.ontology, SoftwareApplication.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Game.Properties with lspace.ns.vocab.schema.SoftwareApplication.Properties{
lazy val gameTip = lspace.ns.vocab.schema.gameTip.property
lazy val musicBy = lspace.ns.vocab.schema.musicBy.property
lazy val directors = lspace.ns.vocab.schema.directors.property
lazy val actors = lspace.ns.vocab.schema.actors.property
lazy val playMode = lspace.ns.vocab.schema.playMode.property
lazy val director = lspace.ns.vocab.schema.director.property
}
override lazy val properties: List[LProperty] = List(gameTip, musicBy, directors, actors, playMode, director)
trait Properties extends lspace.ns.vocab.schema.Game.Properties with lspace.ns.vocab.schema.SoftwareApplication.Properties{
lazy val gameTip = lspace.ns.vocab.schema.gameTip.property
lazy val musicBy = lspace.ns.vocab.schema.musicBy.property
lazy val directors = lspace.ns.vocab.schema.directors.property
lazy val actors = lspace.ns.vocab.schema.actors.property
lazy val playMode = lspace.ns.vocab.schema.playMode.property
lazy val director = lspace.ns.vocab.schema.director.property
}
}