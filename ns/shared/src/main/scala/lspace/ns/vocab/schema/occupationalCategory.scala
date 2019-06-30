package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object occupationalCategory extends PropertyDef(
        iri = "http://schema.org/occupationalCategory",
        iris = Set("http://schema.org/occupationalCategory"),
        label = "occupationalCategory",
        comment = """Category or categories describing the job. Use BLS O*NET-SOC taxonomy: http://www.onetcenter.org/taxonomy.html. Ideally includes textual label and formal code, with the property repeated for each applicable value.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}