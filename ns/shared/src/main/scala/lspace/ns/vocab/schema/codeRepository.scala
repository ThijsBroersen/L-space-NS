package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object codeRepository extends PropertyDef(
        iri = "http://schema.org/codeRepository",
        iris = Set("http://schema.org/codeRepository"),
        label = "codeRepository",
        comment = """Link to the repository where the un-compiled, human readable code and related code is located (SVN, github, CodePlex).""",
        `@extends` = () => List(),
        `@range` = () => List(URL.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}