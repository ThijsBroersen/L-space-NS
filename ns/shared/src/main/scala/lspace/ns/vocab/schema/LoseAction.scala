package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LoseAction extends OntologyDef(
        iri = "http://schema.org/LoseAction",
        iris = Set("http://schema.org/LoseAction"),
        label = "LoseAction",
        comment = """The act of being defeated in a competitive activity.""",
        `@extends` = List(AchieveAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.AchieveAction.Properties{
lazy val winner = lspace.ns.vocab.schema.winner.property
}
override lazy val properties: List[LProperty] = List(winner)
trait Properties extends lspace.ns.vocab.schema.AchieveAction.Properties{
lazy val winner = lspace.ns.vocab.schema.winner.property
}
}